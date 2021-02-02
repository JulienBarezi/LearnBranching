# Question 2 unit test

import Question2

# Performing Unit Tests

import unittest


class TestQuestion2(unittest.TestCase):

    def test_text_handle(self):
        self.assertIn('b', Question2.char_occur("brilliant"))
        self.assertIn('r', Question2.char_occur("programmer"))
