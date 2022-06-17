#include <stdio.h>
#include <time.h>

char* erase(char* chaine) {
  
  char* chaine2 = calloc(strlen(chaine),sizeof(int));
  
  int i = 0;
  int j = 0;
   
   while (chaine[i] != '\0') {
      if ((chaine[i] == ' ' && chaine[i+1] != ' ' && chaine[i-1] != ' ') != 1) {
        chaine2[j] = chaine[i];
        j++;
      }
      i++;
   }
   
   chaine2[j] = '\0';

   printf("Après la suppression des espaces :'%s' ", chaine2);
    
   
   free(chaine2);
}

int main(void) {
  double t = clock();
  erase("Cou cou  J M  B");
  printf("\n%lf", (clock() - t) / CLOCKS_PER_SEC * 1000000000);
  return 0;
}

"
affectation 1
affectation 1
affectation 1

itérations n
    test a
      affectation 1
      affectation 1
    affectation 1
affectation 1

print

n(a(2) + 1) + 1

n nb de chars
a nb de chars différents d'un espace simple(avec aucun espace à coté)

"