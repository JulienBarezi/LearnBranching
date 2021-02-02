import unittest
from main import *


class MyTestCase(unittest.TestCase):
    def test_size(self):
        self.assertEqual(len(students), 7)

    def test_del(self):
        self.assertEqual(len(tv), 3)

    def test_update(self):
        self.assertEqual(len(phones), 5)

    def test_lookup(self):
        self.assertEqual(x, 900)


if __name__ == '__main__':
    unittest.main()
