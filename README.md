# Михаил Сулоски, 193148. Втора лабораториска вежба СИ.
## Control Flow Graph
![image_2021-05-26_143003](https://user-images.githubusercontent.com/79919629/119659822-db2f1100-be2e-11eb-8dc3-0a67b7cbedc9.png)
## 2.Цикломатската комплексност 
### Цикломатската комплексност за дадениот код е 8, па така според формулата за разгранување p + 1, односно во случајов има 7 разгранувања + 1 со што се добива 8. 

## 3.Multiple conditions
### 
### If(h1<0 || hr>24)
### T X 
### F T 
### if (min < 0 || min > 59)
### T X
### F T
### F F

### else if (hr == 24 && min == 0 && sec == 0)
### T T T
### T T F
### T F X
### F X X

### Тест случаи- MultipleCondition
### Овие тестови се прават кога правиме тестирање на повеќе од еден услов. 
### Како што може да се забележи при правње на тестовите искористив AssertThrows, AssertTrue, AssertEquals за да се направи споредување, за да биде фатен соодветниот исклучок (exception).
