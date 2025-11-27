MVN = mvnw

run:
	$(MVN) spring-boot:run

clean:
	$(MVN) clean

build:
	$(MVN) clean package -DskipTests

install:
	$(MVN) clean install

db-console:
	@echo "-------------------------------------------------------"
	@echo "Consola H2 disponible en:"
	@echo "URL:      http://localhost:8080/h2-console"
	@echo "JDBC URL: jdbc:h2:mem:bibliotecadb"
	@echo "Usuario:  username"
	@echo "Password: password"
	@echo "-------------------------------------------------------"