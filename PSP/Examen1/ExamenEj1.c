/*
 ============================================================================
 Name        : ExamenEj1.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(void) {

	  pid_t Hijo1_pid;
	  pid_t Hijo2_pid;
	  pid_t Hijo3_pid;

	  pid_t Padre_pid = getppid();

	  Hijo1_pid=fork();
	  //Hijo2_pid=fork();
	  //Hijo3_pid=fork();

	  switch(Hijo1_pid){	//ERROR al crear al hijo
	  	  case -1:
	  		  printf("No se ha podido crear el proceso hijo...");
	  		  	    exit(-1);
	  	  break;

	  	  case 0:	//Proceso hijo
	  		  printf("Soy el proceso hijo= 1, Mi padre es= %d, Mi PID= %d.\n", Padre_pid, getpid());
	  		  printf("Soy el proceso hijo= 2, Mi padre es= %d, Mi PID= %d.\n", Padre_pid, getpid());
	  		  printf("Soy el proceso hijo= 3, Mi padre es= %d, Mi PID= %d.\n", Padre_pid, getpid());
	  	  break;

	  	  default:
	  		  Padre_pid = wait (NULL);  //Espera la finalización del proceso hijo
	  		  printf("Proceso PADRE = %d\n", getppid());
	  	  break;

	  	  }

	return 0;
}
