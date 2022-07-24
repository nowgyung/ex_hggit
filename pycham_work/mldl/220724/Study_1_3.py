import matplotlib.pyplot as plt #산점도 그래프를 그리기 위한 패키지 설치
from dateutil.rrule import weekday

bream_length = [25.4, 26.3, 26.5, 29.0, 29.0, 29.7, 29.7, 30.0, 30.0, 30.7, 31.0, 31.0, 31.5, 32.0, 32.0, 32.0, 33.0, 33.0, 33.5, 33.5, 34.0, 34.0, 34.5, 35.0, 35.0, 35.0, 35.0, 36.0, 36.0, 37.0, 38.5, 38.5, 39.5, 41.0, 41.0]
bream_weight = [242.0, 290.0, 340.0, 363.0, 430.0, 450.0, 500.0, 390.0, 450.0, 500.0, 475.0, 500.0, 500.0, 340.0, 600.0, 600.0, 700.0, 700.0, 610.0, 650.0, 575.0, 685.0, 620.0, 680.0, 700.0, 725.0, 720.0, 714.0, 850.0, 1000.0, 920.0, 955.0, 925.0, 975.0, 950.0]

smelt_length = [9.8, 10.5, 10.6, 11.0, 11.2, 11.3, 11.8, 11.8, 12.0, 12.2, 12.4, 13.0, 14.3, 15.0]
smelt_weight = [6.7, 7.5, 7.0, 9.7, 9.8, 8.7, 10.0, 9.9, 9.8, 12.2, 13.4, 12.2, 19.7, 19.9]

plt.scatter(bream_length, bream_weight) #산점도 그래프에 들어갈 자료
plt.scatter(smelt_length, smelt_weight)
plt.xlabel('length')
plt.ylabel('weight') #x와 y축의 이름 붙이기, 없어도 상관x
# plt.show()

length = bream_length + smelt_length
weight = bream_weight + smelt_weight

fish_data = [[l,w] for l, w in zip(length, weight)] #2차원 리스트 형태로 만들기위해
print(fish_data)

fish_target = [1]*35 + [0]*14
print(fish_target)

from sklearn.neighbors import KNeighborsClassifier

kn = KNeighborsClassifier()
kn.fit(fish_data, fish_target)
score = kn.score(fish_data, fish_target)
print(score)

prevalue = kn.predict([[30,600]])
plt.scatter(30,600,marker='^')
# plt.show()
print(prevalue)

print(kn._fit_X) # fish_data의 값, bream, smelt
print(kn._y) # 훈련값

kn49 = KNeighborsClassifier(n_neighbors=49) #참고 데이터 49로한  kn49모델
kn49.fit(fish_data, fish_target)
score = kn49.score(fish_data, fish_target)
print(score) #kn49모델의 정확도는? / 매개변수를 49로 두었더니 kn49모델은 도미모델만 올바르게 맞힘

print(35/49)