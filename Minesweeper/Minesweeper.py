# import math
# import sys
#
#
# class Point:
#     def __init__(self, x, y):
#         self.x = x
#         self.y = y
#
#     def subtract(self, p):
#         return Point(self.x - p.x, self.y - p.y)
#
#
# def cross_product(p1: Point, p2: Point):
#     return p1.x * p2.y - p2.x * p1.y
#
#
# def direction(p1: Point, p2: Point, p3: Point):
#     return cross_product(p3.subtract(p1), p2.subtract(p1))
#
#
# def distance(p1: Point, p2: Point):
#     x = p1.x - p2.x
#     y = p2.y - p1.y
#     return math.sqrt(x * x + y * y)
#
#
# def convex_hull(points: list, radius: int):
#     leftmost = min(points, key=lambda point: point.x)
#     leftmost_index = points.index(leftmost)
#
#     # convex hull
#     convex_hull_points = [leftmost]
#     while True:
#         next_index = (leftmost_index + 1)  # % len(points)
#         for i in range(len(points)):
#             if i == leftmost_index:
#                 continue
#
# s = sys.stdin.readline().split(" ")
# n = s[0]
# radius = s[1]
# points = []
# for i in range(n):
#     p = sys.stdin.readline().split(" ")
#     points.append(Point(p[0], p[1]))
