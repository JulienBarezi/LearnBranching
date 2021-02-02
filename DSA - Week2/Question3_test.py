# Question 3 unit test

import Question3

# Performing Unit Tests

import unittest


class TestQuestion3(unittest.TestCase):

    def test_text_handle(self):
        t_list1 = [[55, 57, 90, 87, 43, 65, 60], [57, 60, 78, 74, 89, 45, 43], [43, 60, 90, 65, 38, 65, 78]]
        t_list2 = [[12, 6, 7, 8, 9, 10, 4], [10, 3, 5, 6, 20, 8, 5], [0, 85, 52, 4, 38, 1, 20]]
        self.assertEqual(Question3.list_handle(t_list1), [89, 65, 38, 74, 43, 45, 78, 55, 87, 57, 90, 60])
        self.assertEqual(Question3.list_handle(t_list2), [0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 38, 12, 20, 85, 52])
