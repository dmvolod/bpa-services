# Загрузка проекта на сервер исполнения
TBD

# Получение списка доступных для выполнения процессов
'''
curl -X GET "http://myapp-kieserver-pam70.apps.ose.rht.mont.com/services/rest/server/containers/bpa-project_1.0.0-SNAPSHOT/processes" -H  "accept: application/json" -H  "content-type: application/json" --insecure --user admin:admin
'''
bpa-project_1.0.0-SNAPSHOT - container Id

# Запуск на выполнение процесса пользователем
'''
curl -X POST "https://secure-myapp-kieserver-pam70.apps.ose.rht.mont.com/services/rest/server/containers/bpa-project_1.0.0-SNAPSHOT/processes/Vacation/instances" -H  "accept: application/json" -H  "content-type: application/json" -d @process-variables.json --insecure --user admin:admin -i
'''
bpa-project_1.0.0-SNAPSHOT - container Id
Vacation - process Id

# Остановить процесс
Эта функциональность не поддерживается на уровне KIE движка в версии 7.7 (PAM 7.0.2)

# Возобновить процесс
Эта функциональность не поддерживается на уровне KIE движка в версии 7.7 (PAM 7.0.2)

# Получить доступные задачи для пользователя
'''
curl -X GET "https://secure-myapp-kieserver-pam70.apps.ose.rht.mont.com/services/rest/server/queries/tasks/instances/process/6?status=Ready&status=Reserved&status=InProgress&page=0&pageSize=10&sortOrder=true" -H  "accept: application/xml" --insecure --user admin:admin
'''
6 - process instance Id

# Изменить статус процесса до окончания
Процесс можно только остановить навсегда
'''
curl -X DELETE "https://secure-myapp-kieserver-pam70.apps.ose.rht.mont.com/services/rest/server/containers/bpa-project_1.0.0-SNAPSHOT/processes/instances/5" -H  "accept: application/xml" --insecure --user admin:admin
'''
bpa-project_1.0.0-SNAPSHOT - container Id
5 - process instance Id