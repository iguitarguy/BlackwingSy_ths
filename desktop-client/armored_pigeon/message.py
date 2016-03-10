#!usr/bin/python3
# message.py by Mike Deiters
# Class to handle encrypting and decrypting messages

class Message:
    def __init__(self, **kwargs):
        self._properties = kwargs

    def set_property(self, key, value):
        self._properties[key] = value

    def get_property(self, key):
        return self._properties.get(key, None)

    def encrypt(self):
        # Define encrypt method
        return

    def decrypt(self):
        # Define decrypt method
        return

    def send(self):
        # Send email method
        return