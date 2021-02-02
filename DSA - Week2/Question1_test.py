# Question 1 unit test

import Question1

# Performing Unit Tests

import unittest


class TestQuestion6(unittest.TestCase):

    def test_text_handle(self):
        self.assertEqual(Question1.text_handle("Say    hi    to    her"), "Say hi to her")
        self.assertEqual(Question1.text_handle("I     am   a   good   programmer"), "I am a good programmer")
