#!usr/bin/python3

from kivy.app import App
from kivy.uix.screenmanager import Screen, SlideTransition
from armored_pigeon.message import Message

class Connected(Screen):
    def disconnect(self):
        self.manager.transition = SlideTransition(direction='right')
        self.manager.current = 'login'
        self.manager.get_screen('login').resetForm()

    def encrypt(self, message):
        body = Message()
        encrypted_message = body.encrypt(message)
        print('Encrypted Message:', encrypted_message)
        self.ids['crypt'].text = encrypted_message

    def resetForm(self):
        self.ids['message'].text = ''

    def clear(self):
        self.ids['message'].text = ''
        self.ids['crypt'].text = ''