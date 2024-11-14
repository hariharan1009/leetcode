typedef struct Trie {
    struct Trie *next[26];
    bool end;
} Trie;
Trie* trieCreate() {
   Trie* node=(Trie*)malloc(sizeof(Trie));
   for(int i=0;i<26;i++){
       node->next[i]='\0';
   }
   node->end=false;
   return node;
}
void trieInsert(Trie* obj, char* word) {
   Trie* tptr=obj;
   int pos;
   while(*word){
       pos=*word-'a';
       if(!tptr->next[pos]){
           tptr->next[pos]=trieCreate();
       }
       tptr=tptr->next[pos];
       word++;
   }
   tptr->end=true;
}

bool trieSearch(Trie* obj, char* word) {
   Trie* tptr=obj;
   int pos;
   while(*word){
       pos=*word-'a';
       if(!tptr->next[pos]){
           return false;
       }
       tptr=tptr->next[pos];
       word++;
   }
   return tptr->end;
}

bool trieStartsWith(Trie* obj, char* word) {
   Trie* tptr=obj;
   int pos;
   while(*word){
       pos=*word-'a';
       if(!tptr->next[pos]){
           return false;
       }
       tptr=tptr->next[pos];
       word++;
   }
   return true;
}

void trieFree(Trie* obj) {
      free(obj);
}