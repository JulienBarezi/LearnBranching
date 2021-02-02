# Question 5 unit test

import Question5

# Performing Unit Tests

import unittest


class TestQuestion6(unittest.TestCase):

    def test_text_handle(self):
        self.assertEqual(Question5.outtimes(4), [1, 2, 2, 3, 3, 3, 4, 4, 4, 4])
        self.assertEqual(Question5.outtimes(6), [1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6])