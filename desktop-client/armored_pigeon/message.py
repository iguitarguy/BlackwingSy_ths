#!usr/bin/python3
# message.py by Mike Deiters
# Class to handle encrypting and decrypting messages
from armored_pigeon import gpg
import smtplib

class Message:
    def __init__(self, **kwargs):
        self._properties = kwargs

    def set_property(self, key, value):
        self._properties[key] = value

    def get_property(self, key):
        return self._properties.get(key, None)

    # Define encrypt method
    def encrypt(self, user, message):
        encrypted_message = gpg.encrypt(message, user.public_key)
        return str(encrypted_message)

    # Define decrypt method
    def decrypt(self, message):
        decrypted_message = gpg.decrypt(message)
        return str(decrypted_message)

    # Send email method
    def send(self, user, message):
        encrypted_message = gpg.encrypt(message, user.public_key)
        reciever = user.get_property('email')

        # Replace with actual email address after domain purchased
        sender = 'no_reply@armoredpigeon.io'

        try:
            smtpObj = smtplib.SMTP('localhost')
            smtpObj.sendmail(sender, reciever, message)
            return True # Email was sent
        except smtplib.SMTPException:
            return False # Email failed to send