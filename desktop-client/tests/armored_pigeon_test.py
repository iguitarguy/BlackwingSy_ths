#!/user/bin/python3
# armored_pigeon_test.py by Mike Deiters and Eric Kim
# This will test all of our functions

import armored_pigeon
import unittest

class TestArmoredPigeon(unittest.TestCase):
    def setUp(self):
        print('Setup')

    def tearDown(self):
        print('Tear Down')

    def test_basic(self):
        print('I Ran')

if __name__ == "__main__": unittest.main()