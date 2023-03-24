for num in range(2, 100):
    for x in range(2, num):
        if num % x == 0:
            break
    else:
        print(f"{num} is a prime number")

