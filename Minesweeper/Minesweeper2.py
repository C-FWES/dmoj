import math
import sys


class Point:
    def __init__(self, x, y):
        self.x = int(x)
        self.y = int(y)


def direction(p1: Point, p2: Point, p3: Point):
    value = (p2.y - p1.y) * (p3.x - p2.x) - (p2.x - p1.x) * (p3.y - p2.y)
    if value == 0:
        return value
    elif value > 0:
        return 1
    else:
        return 2


def convex_hull(points: list):
    leftmost = min(points, key=lambda point: point.x)
    leftmost_index = points.index(leftmost)
    hull = []
    p1 = leftmost_index
    length = len(points)
    while True:
        hull.append(points[p1])
        p2 = (p1 + 1) % length
        for i in range(length):
            if direction(points[p1], points[i], points[p2]) == 2:
                p2 = i
        p1 = p2
        if p1 == leftmost_index:
            break
    return hull


def calculate_distance(p1: Point, p2: Point):
    x_diff = p1.x - p2.x
    y_diff = p1.y - p2.y
    return math.sqrt(x_diff**2 + y_diff**2)


s = sys.stdin.readline().split(" ")
n = int(s[0])
radius = int(s[1])
points = []
for i in range(n):
    p = sys.stdin.readline().split(" ")
    points.append(Point(p[0], p[1]))
convex_hull = convex_hull(points)
convex_hull.append(convex_hull[0])
perimeter = 0.000
for i in range(len(convex_hull)-1):
    perimeter += calculate_distance(convex_hull[i], convex_hull[i+1])
print(perimeter + 2 * radius * math.pi)
