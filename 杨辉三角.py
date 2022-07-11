def triangles():
     L=[1]
     while True:
        yield L
        L1=L+[0]
        L2=[L1[x]+L1[x+1] for x in range(len(L1)-1)]
        L=[1]+L2
n=int(input("请输入行数："))
m=0
for i in triangles():
    print(format(str(i),'^200'))
    m=m+1
    if m==n:
        break

