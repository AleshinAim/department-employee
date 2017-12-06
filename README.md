**Задание**

Есть сотрудники и департаметы.

Удепартамента может быть много сотрудниковю А может и не быть.
Есть список департаментов. И есть кнопочки `"Добавить/Редактировать/Удалить/Список сотрудников"`

При нажатии `"Список"` показываются сотруники этого департамента с теми же кнопочками.

Список - табличка, страница добавления/редактирование - набор текстфилдов.

_Технологии:_

1. БД - `jdbc`
2. `COntroller` - `servlet`
3. View - `jsp+el+jstl`
4. Валидация данных
5. Уникальность имени у департамента и мыла у пользователя.
6. У сотрудника обязательно одно поле - числовое, одно дата.
7. Данные после валидации пропадать не должны, даже если они введены не правильно.

_Рекомендуемые средство разработки:_

1. Intellij IDEA (http://www.jetbrains.com/idea/)
2. JDK 1.6 - последний билд.

**Результат**

Приложение собранно при помощи `Apache Maven` версии 3.5.0 (https://maven.apache.org/download.cgi),
разворачивается на сервере `Apache Tomcat®` версия 9.0 (https://tomcat.apache.org/download-90.cgi).

Для хранения данных о департаментах и сотрудниках использовалась свободная 
объектно-реляционная система управления базами данных `PostgreSQL` версии 9.6 
(https://www.postgresql.org/download/).

Скрипты для создания базы даных находятся в каталоге `/sql`

