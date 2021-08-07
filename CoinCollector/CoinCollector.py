import sys


class Coin:
    def __init__(self, value, has_coin):
        self.value = value
        self.has_coin = has_coin


s = sys.stdin.readline().split(" ")
n = int(s[0])
k = int(s[1])
coins = []
for i in range(n):
    x = sys.stdin.readline().split(" ")
    coins.append(Coin(int(x[0]), int(x[1])))
coins.append(Coin(k, 0))
sum = 0
max_coins = 0
for i in range(n):
    if coins[i].has_coin == 0 and sum + coins[i].value < coins[i+1].value:
        sum += coins[i].value
        max_coins += 1
if sum == 0:
    sum = 1
print(max_coins)
print(k-sum)