#!usr/bin/python3

from kivy.app import App
from kivy.uix.screenmanager import Screen, SlideTransition
from kivy.uix.label import Label

class SendMessage(Screen):
    def disconnect(self):
        self.manager.transition = SlideTransition(direction='right')
        self.manager.current = 'login'
        self.manager.get_screen('login').resetForm()

    def display_message(self, message):
        self.manager.add_widget(Label(text=message))