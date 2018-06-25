Project Euler solutions
=======================

```python
ans = max(i * j
    for i in range(100, 1000)
    for j in range(100, 1000)
    if str(i * j) == str(i * j)[ : : -1])
return str(ans)

import eulerlib, itertools, sys
if sys.version_info.major == 2:
    filter = itertools.ifilter

# Decorator. The underlying function must take only positional arguments, no keyword arguments.
class memoize(object):

        def __init__(self, func):
                self.func = func
                self.cache = {}

        def __call__(self, *args):
                if args in self.cache:
                        return self.cache[args]
                else:
                        val = self.func(*args)
                        self.cache[args] = val
                        return val

def compute():
        sys.setrecursionlimit(3000)
        ans = max(range(1, 1000000), key=collatz_chain_length)
        return str(ans)


@eulerlib.memoize
def collatz_chain_length(x):
        if x == 1:
                return 1
        if x % 2 == 0:
                y = x // 2
        else:
                y = x * 3 + 1
        return collatz_chain_length(y) + 1
```
