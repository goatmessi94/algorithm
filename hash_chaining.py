hash_table = list([0 for i in range(8)])

def get_key(data):
    return hash(data)

#key 값을 8로 나눈 나머지
def hash_function(key):
    return key % 8

#데이터 저장 함수
def save_data(data, value):
    #index_key는 해시값을 가지는것
    index_key = get_key(data)
    
    #해시 주소 = 해시 8나누기 값
    hash_address = hash_function(index_key)
    
    # 해시테이블의 [해시주소가] 0이 아니라면,--> 값이 이미 있다면
    if hash_table[hash_address] != 0:

        # 해시테이블의[해시주소] 크기만큼 반복 
        for index in range(len(hash_table[hash_address])):
            # 해시테이블[해시주소][index]의 0과 같다면
            if hash_table[hash_address][index][0] == index_key:
                #해시테이블[해시주소][index]의 1에 value값을 넣는다. 덮어씌운다?
                hash_table[hash_address][index][1] == value
                return
        hash_table[hash_address].append([index_key.value])
    else:
        hash_table[hash_address] = list([index_key.value])



#테이블을 리턴함으로써 값을 리턴함
def read_data(data):
    index_key = get_key(data)
    hash_address = hash_function(index_key)
    if hash_table[hash_address] !=0:
        for index in range(len(hash_table[hash_address])):
            if hash_table[hash_address][index][0] == index_key:
                return hash_table[hash_address][index][1]
        return None
    else:
        return None
    return hash_table[hash_address]