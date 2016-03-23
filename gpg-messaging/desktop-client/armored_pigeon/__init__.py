#!usr/bin/python3
# __init__.py by Mike Deiters and Eric Kim
# Import statements and init code

import gnupg
import pymysql
import pymysql.cursors
from armored_pigeon.user import User

gpg = gnupg.GPG()
gpg.encoding = 'utf-8'


# connection = pymysql.connect(
#     host='172.20.0.90:3306',
#     user='admin',
#     password='password',
#     db='armored_pigeon',
#     charset='utf8mb4',
#     cursorclass=pymysql.cursors.DictCursor
# )

keyserver = '172.20.0.90:11371'

# input_data = gpg.gen_key_input(
#     name_email='test@armoredpigeon.io',
#     passphrase='password'
# )
# key = gpg.gen_key(input_data)
#
# ascii_armored_public_keys = gpg.export_keys(key)
# ascii_armored_private_keys = gpg.export_keys(key, True)
# with open('mykeyfile.asc', 'w') as f:
#     f.write(ascii_armored_public_keys)
#     f.write(ascii_armored_private_keys)
#
# key_data = open('mykeyfile.asc').read()
# import_result = gpg.import_keys(key_data)
# print(import_result.results)