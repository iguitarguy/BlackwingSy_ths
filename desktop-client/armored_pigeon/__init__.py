#!usr/bin/python3
# __init__.py by Mike Deiters and Eric Kim
# Import statements and init code

import gnupg
import pymysql
import pymysql.cursors

gpg = gnupg.GPG()
gpg.encoding = 'utf-8'


connection = pymysql.connect(
    host='',
    user='',
    password='',
    db='',
    charset='utf8mb4',
    cursorclass=pymysql.cursors.DictCursor
)

keyserver = '172.20.0.90:11371'