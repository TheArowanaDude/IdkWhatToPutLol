#include<iostream> 
#include<string> 
#include <algorithm>
#include <chrono>
#include <thread>

std::string generateWord(); 
bool isInWord(char to_check, char *&guessWord); 
bool isInWord(char to_check, std::string guessWord);

class hangman{ 
public: 
    void generateWord(); 
    std::string word; 
    int tries = 12; 
    bool isInWord(char to_check, char *&guessWord);
    bool isInWord(char to_check, std::string guessWord); 
    std::string letters = "a b c d e f g h i j k l m n o p q r s t u v w x y z"; 


private: 
    std::string array[17] = {"dinosaur", "chicken", "lol", "you", "zain","rayyan","micropachycephalosaurs", "cow","dolphin","dog", "xenophobe", "compsagnathus", "mustafa", "turkey", "pakistan", "asif","donkey"};

};







int main(){
    hangman game; 
    game.generateWord();
    char letterGuessed; 
    char* guessWord = new char[game.word.length()];
    using namespace std::this_thread; // sleep_for, sleep_until
    using namespace std::chrono; // nanoseconds, system_clock, seconds
    for(int i = 0; i < game.word.length(); i++) 
        guessWord[i] = ' '; 

     
    std::cout<<"Welcome to Rayyan's hangman text adventure!"<<std::endl; 
    std::cout<<"Setting game up..."<<std::endl;
    sleep_for(seconds(2));
    
    std::cout<<"A random word has been generated!"<<std::endl;
    

    while(game.word != guessWord && game.tries != 1){ 
        std::cout<<"please input a letter: ";
        std::cin>>letterGuessed; 
        if(!game.isInWord(letterGuessed, guessWord)){
            game.tries--; 
            std::cout<<"number of tries left: "<<game.tries<<std::endl;

            if(!game.isInWord(letterGuessed,game.letters)){ 
                std::cout<<"You have already used this letter, remaining letters left: "<<'\n'<< game.letters<<std::endl; 
            }
            game.letters.erase(std::remove(game.letters.begin(), game.letters.end(), letterGuessed), game.letters.end());
        } 
        else if(!game.isInWord(letterGuessed,game.letters)){ 
            std::cout<<"You have already used this letter, remaining letters left: "<<'\n'<< game.letters<<std::endl; 
            std::cout<<"number of tries left: "<<game.tries<<std::endl;        
            game.tries--;
        }

        else{ 
            game.letters.erase(std::remove(game.letters.begin(), game.letters.end(), letterGuessed), game.letters.end());
            std::cout<<"letters remaining: "<<game.letters<<std::endl;
//            game.word.erase(std::remove(game.word.begin(), game.word.end(), letterGuessed), game.word.end());
            

        }
        
    } 

    std::cout<<"Final word: "<<game.word<<std::endl;
}


void hangman::generateWord(){ 
    srand(static_cast<unsigned int>(time(0)));
    word = array[rand() % 17];
//    std::cout<<"random word: "<<word<<std::endl;
} 

bool hangman::isInWord(char to_check, char *&guessWord){ 
    char* ptr = guessWord; 
//    std::cout<<"Does this execute"<<std::endl;
    bool flag = false; 
    for(int index = 0; index < this->word.length(); index++){ 
        ptr = &guessWord[0]; 
        if(to_check == this->word[index]){
            flag = true; 
            guessWord[index] = to_check;  

        }

    }
 
    for(int i = 0; i < this->word.length(); i++)
        std::cout<<guessWord[i];        
    std::cout<<'\n';
    std::cout<<'\n';
    return flag; 
}


bool hangman::isInWord(char to_check, std::string guessWord){ 
    bool flag = false; 
    for(int index = 0; index < this->letters.length(); index++)  
        if(to_check == this->letters[index])
            flag = true; 

 
    return flag; 
}



