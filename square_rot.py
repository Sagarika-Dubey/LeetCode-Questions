class Solution:
    def mySqrt(self, x: int) -> int:
        #return int(pow(x,0.5))
        left=0
        right=x
        while left<= right:
            mid= (left+right)//2
            if mid*mid<x:
                left=mid+1
            elif mid * mid>x:
                right= mid-1
            else:
                return mid
        return right