# Исключения в программировании и их обработка

## Урок 1. Обработка ошибок в программировании

**Домашнее задание**

1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

_Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?_ — **Какой код?**

2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
   каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не 
   равны, необходимо как-то оповестить пользователя.


3. \* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
   каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не 
   равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое 
   пользователь может увидеть - RuntimeException, т.е. ваше.

[Решение](https://github.com/psyfluid/gb02-1-10_exceptions/tree/main/src/java/gb/hw01)

## Урок 2. Исключения и их обработка

1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное 
   значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно 
   запросить у пользователя ввод данных.
2. Если необходимо, исправьте данный код ([задание 2](https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit))
3. Дан следующий код, исправьте его там, где требуется ([задание 3](https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit))
4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно 
   показаться сообщение, что пустые строки вводить нельзя.

[Решение](https://github.com/psyfluid/gb02-1-10_exceptions/tree/main/src/java/gb/hw02)

## Урок 3. Продвинутая работа с исключениями в Java

Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
фамилия, имя, отчество - строки

дата_рождения - строка формата dd.mm.yyyy

номер_телефона - целое беззнаковое число без форматирования

пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия> <Имя> <Отчество> <датарождения> <номертелефона> <пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

[Решение](https://github.com/psyfluid/gb02-1-10_exceptions/tree/main/src/java/gb/hw03)