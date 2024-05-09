class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        '''#method 1
        array=s.split()
        return len(array[-1])
        '''
        #method 2
        length=0
        i=len(s)-1
        while i>=0 and s[i]==" ":
            i=i-1
        while i>=0 and s[i]!=" ":
            length=length+1
            i=i-1
        return length