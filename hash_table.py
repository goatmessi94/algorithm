
#해시테이블 0부터 9까지 0으로 초기화 하는테이블 생성
hash_table=list([0 for i in range(10)])

#5나머지 나오는값 리턴
def hash_func(key):
    return key % 5

#
data1 = 'Andy'
data2 = 'Dave'
data3 = 'Trump'

print(ord(data1[0]))

#딕셔너리 함수와 많이 유사
def storage_data(data, value):
    key = ord(data[0])
    hash_address = hash_func(key)
    hash_table[hash_address] = value

storage_data('Andy','01055553333')

def get_data(data):
    key = ord(data[0])
    hash_address = hash_func(key)
    return hash_table[hash_address]

print(get_data('Andy'))

