#!/usr/bin/python3
# users.py by Eric Kim
# Test class to handle the User test case

import unittest
import mysql.connector
import os
import logging;

logging.getLogget(__name__)

#setup foo db for testcase users.
from mysql.connector import errorcode

try:
    config = {
        'user': 'root',
        'password': 'root',
        'host': 'localhost:3306',
        'database': 'inventory',
        'raise_on_warnings': True,
    }

    cnn = mysql.connector.connect(
        user='root',
        password='root',
        host='localhost:3306',
        database='Test_db'
    )

    print("it works!")
except mysql.connector.Error as e:
    if e.errno == errorcode.ER_ACCESS_DENIED_ERROR:
        print("Something is wrong with username or password")
    elif e.errno == errorcode.ER_BAD_DB_ERROR:
        print("Database does not exist")
    else:
        print(e)

    cursor = config.cursor()

    addName = ("Insert INTO Name (Name, Type) VALUES (%s, %s)")
    Name = "Eric"
    Type = "Kim"
    empName = (Name, Type)

    cursor.execute(addName, empName)

    config.commit()
    cursor.close()
    config.close


class Users(object):

    #setup foo dictionary of users
    user_lib = dict(user_id='', first_name='', last_name='', email='', twitter_handle='',
                    public_key='', friends_list=[], friend_requests=[])
    user_lib['user01'] = (
    '01', 'Bob', 'lee', 'bobs@email.com', 'bobsTwitter', 'bobsHashKey', '[Jamie, James]', '[Man, Woman]')
    user_lib['user02'] = (
    '02', 'hen', 'lee', 'Hen@email.com', 'bobsTwitter', 'bobsHashKey', '[Jamie, James]', '[Man, Woman]')
    user_lib['user03'] = (
    '03', 'Foo', 'lee', 'foo@email.com', 'bobsTwitter', 'bobsHashKey', '[Jamie, James]', '[Man, Woman]')
    user_lib['user04'] = (
    '04', 'Ben', 'lee', 'Ben@email.com', 'bobsTwitter', 'bobsHashKey', '[Jamie, James]', '[Man, Woman]')
    user_lib['user05'] = (
    '05', 'Manaa', 'lee', 'Manaa@email.com', 'bobsTwitter', 'bobsHashKey', '[Jamie, James]', '[Man, Woman]')

    user_id = 0
    first_name = ''
    last_name = ''
    email = ''
    twitter_handle = ''
    public_key = ''
    friends_list = []
    friend_requests = []

    # initializer
    def __init__(self, **kwargs):
        self.properties = kwargs

    def get_properties(self):
        return self.properties

    def get_property(self, key):
        return self.properties.get(key, None)

        # @property
        # def user_id(self):
        #     return self.properties.get('userid', None)
        #
        # @user_id.setter
        # def user_id(self, c):
        #     self.properties['userid'] = c
        #
        # @user_id.deleter
        # def user_id(self):
        #     del self.properties['userid']
        #
        # @property
        # def first_name(self):
        #     return self.properties.get('firstname', None)
        #
        # @first_name.setter
        # def first_name(self, c):
        #     self.properties['firstname'] = c
        #
        # @first_name.deleter
        # def first_name(self):
        #     del self.properties['firstname']
        #
        # @property
        # def last_name(self):
        #     return self.properties.get('lastname', None)
        #
        # @last_name.setter
        # def last_name(self, c):
        #     self.properties['lastname'] = c
        #
        # @last_name.deleter
        # def last_name(self):
        #     del self.properties['lastname']
        #
        # @property
        # def twitter_handle(self):
        #     return self.properties.get('twitterhandle', None)
        #
        # @twitter_handle.setter
        # def twitter_handle(self, c):
        #     self.properties['twitterhandle'] = c
        #
        # @twitter_handle.deleter
        # def twitter_handle(self):
        #     del self.properties['twitterhandle']
        #
        # @property
        # def email(self):
        #     return self.properties.get('email', None)
        #
        # @email.setter
        # def email(self, c):
        #     self.properties['email'] = c
        #
        # @email.deleter
        # def email(self):
        #     del self.properties['email']
        #
        # @property
        # def public_key(self):
        #     return self.properties.get('publickey', None)
        #
        # @public_key.setter
        # def public_key(self, c):
        #     self.properties['publickey'] = c
        #
        # @public_key.deleter
        # def public_key(self):
        #     del self.properties['publickey']
        #
        # @property
        # def friends_list(self):
        #     return self.properties.get('friendslist', None)
        #
        # @friends_list.setter
        # def friends_list(self, c):
        #     self.properties['friendslist'] = c
        #
        # @friends_list.deleter
        # def friends_list(self):
        #     del self.properties['friendslist']
        #
        # @property
        # def friend_requests(self):
        #     return self.properties.get('friendrequests', None)
        #
        # @friend_requests.setter
        # def friend_requests(self, c):
        #     self.properties['friendsrequets'] = c
        #
        # @friend_requests.deleter
        # def friend_requests(self):
        #     del self.properties['friendrequests']


class UserTestCase():
    # users params: user_id (int), first_name(string), last_name(string), email(string),
    # twitter_handle(string), public_key(string), friends_list(list), friend_requests(list)



    def __init__(self, **kwargs):
        self._properties = kwargs

    def set_property(self, key, value):
        self._properties[key] = value

    def get_property(self, key):
        return self._properties.get(key, None)

    def req_friend(self, user_id):
        # TODO friend request method
        # find user_id of the friend
        # test case of user_id input
        user_id = 'user02'
        user_req = Users[user_id]
        print(user_req + ' : This is the user number that you requested to friend')


        # send a invite so that the friend accepts the friend request
        # have both users friend list change so that the new user is in their friends list

    @property
    def public_key(self):
        return self._properties.get('public key', None)

    @public_key.setter
    def public_key(self, public_key):
        self._properties['public key'] = public_key

    @public_key.deleter
    def public_key(self):
        del self._properties['public_key']


# unittest.main()
#  req_friend()
