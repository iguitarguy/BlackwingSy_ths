#!/usr/bin/python3
# users.py by Eric Kim
# Class to handle the User


class User:

    def __init__(self, **kwargs):
        self._properties = kwargs

    def set_property(self, key, value):
        self._properties[key] = value

    def get_property(self, key):
        return self._properties.get(key, None)
    
    def req_friend(self, user_id):
        # TODO
        # friend request method
        return
    
    @property
    def public_key(self):
        return self._properties.get('public key', None)
    
    @public_key.setter
    def public_key(self, public_key):
        self._properties['public key'] = color
        
    @public_key.delete
    def public_key(self):
        del self._properties['public_key']
        
        
    

