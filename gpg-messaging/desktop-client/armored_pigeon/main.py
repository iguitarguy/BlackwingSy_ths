#!usr/bin/python3

from kivy.app import App
from kivy.properties import StringProperty
from kivy.uix.screenmanager import ScreenManager, Screen, SlideTransition
import os
# from armored_pigeon.auth import Auth

from armored_pigeon.connected import Connected
from armored_pigeon.sendmessage import SendMessage

class Login(Screen):
    def do_login(self, loginText, passwordText):
        app = App.get_running_app()

        app.username = loginText
        app.password = passwordText

        # auth = Auth(app.username, app.password)
        # auth.hash_pass()
        # authenticated = auth.authenticate()

        # if (authenticated.isAuth):
        if (True):
            self.manager.transition = SlideTransition(direction='left')
            self.manager.current = 'connected'
            self.manager.get_screen('connected')
        else:
            print('Not Authenticated')

        # app.config.read(app.get_application_config())
        # app.config.write()

    def resetForm(self):
        self.ids['login'].text = ''
        self.ids['password'].text = ''

class LoginApp(App):
    username = StringProperty(None)
    password = StringProperty(None)

    def build(self):
        manager = ScreenManager()

        manager.add_widget(Login(name='login'))
        manager.add_widget(Connected(name='connected'))

        return manager

    def get_application_config(self):
        if (not self.username):
            return super(LoginApp, self).get_application_config()

        conf_directory = self.user_data_dir + '/' + self.username

        if (not os.path.exists(conf_directory)):
            os.makedirs(conf_directory)

        return super(LoginApp, self).get_application_config(
            '%s/config.cfg' % (conf_directory)
        )

if __name__ == '__main__':
    LoginApp().run()