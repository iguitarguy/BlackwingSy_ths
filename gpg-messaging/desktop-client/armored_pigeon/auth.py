#!/usr/bin/python3
# users.py by Eric Kim
# Class to handle the Authentication

from armored_pigeon import connection

class Auth:
    
    def __init__(self, email, password):
        self._email = email
        self._password = password
    
    def hash_pass(self):
        # Hash the password to check against the database
        # TODO
        return
    
    def authenticate(self):
        # This method will check the email and password against the database
        # to authenticate the user.
        return

