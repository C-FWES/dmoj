import sys


def make_int(coins: list, length):
    coins = [int(coins[i]) for i in range(len(coins))]
    return coins


t = int(sys.stdin.readline())
for i in range(t):
    n = int(sys.stdin.readline())
    coins = sys.stdin.readline().split(" ")
    lenght = len(coins)
    coins = make_int(coins, lenght)
    coins.sort()
    if n % 2 != 0:
        sb = ""
        for i in range(lenght):
            sb = sb + str(coins[i]) + " "
        print(sb.strip())
    else:
        if coins.count(coins[0]) == lenght:
            print(-1)
        else:
            sb = ""
            half = int(n / 2)
            b = coins[0:half]
            c = coins[half:n]
            for i in range(len(b)):
                sb = sb + str(b[i]) + " " + str(c[i]) + " "
            print(sb.strip())
