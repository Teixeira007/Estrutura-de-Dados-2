#include<iostream>


using namespace std;

typedef enum{
    C_RED,
    C_BLACK
} ARN_COR;


typedef struct ARN{
    struct ARN *esq;
    struct ARN *dir;
    int key;
    int value;
    ARN_COR color;

} ARN;

void ARN_Insert(ARN **A, int key, int value);


int main(int argc, char** argv){


    ARN* A = NULL;

    ARN_Insert(&A, (int)'U', 0);
    ARN_Insert(&A, (int)'F', 0);
    ARN_Insert(&A, (int)'P', 0);
    ARN_Insert(&A, (int)'B', 0);

}

ARN* ARN_Criar(int key, int value){
    ARN novo;
    novo = malloc(sizeof(ARN));
    novo-> key = key;
    novo-> value = value;
    novo-> color = C_RED;
    novo-> esq = NULL;
    novo-> dir = NULL;

    return novo;
}

static inline int isRed(ARN *A){
    if(A == NULL){
        return 0;
    }

    return A->color == C_RED ? 1 : 0;
}

static void inversionColor(ARN *A){
    A-> color = C_RED;
    A->esq->color = C_BLACK;
    A->dir->color = C_BLACK;
}

static void rot_esq(ARN **A){
    ARN *h, *x;
    h = *A;
    x = h->dir;
    h->dir = x->esq;
    x->esq = h;
    x->color = h->color;
    h->color = C_RED;
    *A = x;
}

static void rot_dir(ARN **A){
    ARN *h, *x;
    h = *A;
    x = h->esq;
    h->esq = x->dir;
    x->dir = h;
    x->color = h->color;
    h->color = C_RED;
    *A = x;
}

void ARN_insert_R(ARN **A, int key, int value){
    if((*A) == NULL){
        *A = ARN_Criar(key, value);
        return;
    }

    if(key < (*A) -> key){
        ARN_Insert_R(&(*A)->esq. key, value);
    }

    if(chave > (*A) -> key){
        ARN_Insert_R(&(*A)-> dir, key, value)
    }

    if(isRed((*A)->dir) && !isRed((*A)->esq)){
        rot_esq(A);
    }

    if((isRed((*A)->esq) && isRed((*A)->esq->esq)){
        rot_dir(A);
    }

    if(isRed((*A)->esq) && isRed((*A)->dir)){
        inversionColor(*A)
    }
}

void ARN_insert(ARN **A, int key, int value){
    ARN_insert_R(A, key, value);
    (*A)->color = C_BLACK;
}