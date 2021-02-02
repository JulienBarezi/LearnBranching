# Question 4 unit test

import Question4

# Performing Unit Tests

import unittest


class TestQuestion9(unittest.TestCase):

    def test_text_handle(self):
        t_list1 = [1, 2, 3, 4]
        t_list2 = [1, 3, 4]
        self.assertEqual(Question4.list_handle(t_list1, t_list2), {2})