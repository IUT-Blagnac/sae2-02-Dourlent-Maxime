
#include "solution.h"

char* erase(char* chaine) {
    int i, j;
    while(chaine[i] != '\0'){
        if(chaine[i] == ' ' && chaine[i+1] != ' '){
            j++;
        }else{
            chaine[j] = chaine[i];
            j++;
        }

        i++;
    }
    
    
    



    printf("%s", chaine);
    return chaine;
}


int main() {
    printf("%s\n",erase(" Cou cou  J M  B "));
}