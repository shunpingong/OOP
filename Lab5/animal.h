#include <iostream>
#include <string>

using namespace std ;

enum COLOR { Green, Blue, White, Black, Brown } ;

class Animal {
    public :
        Animal() : _name("unknown") {
            cout << "constructing Animal object "<< _name << endl ;
        }

        Animal(string n, COLOR c) : _name(n), _color(c)
        {
            cout << "constructing Animal object " << _name << " with color of ";

            switch(c)
            {
                case Green:
                    cout << "Green" << endl;
                    break;

                case Blue:
                    cout << "Blue" << endl;
                    break;

                case White:
                    cout << "White" << endl;
                    break;

                case Black:
                    cout << "Black" << endl;
                    break;

                case Brown:
                    cout <<"Brown" << endl;
                    break;
            }
        }
        ~Animal() {
            cout << "destructing Animal object " << _name << endl ;
        }
        COLOR getColor()
        {
            return _color;
        }

        string getName()
        {
            return _name;
        }

        virtual void speak() {
            cout << "Animal speaks "<< endl ;
        }
        virtual void move() = 0;
    private :
        string _name;
        COLOR _color ;
};

class Mammal : public Animal
{
    public :
        Mammal() : Animal()
        {
            cout << "Constructing Mammal object " << Animal::getName() << endl;
        }

        Mammal(string n, COLOR c) : Animal(n, c)
        {
            cout << "Constructing Mammal object " << Animal::getName() << " with color of ";

            switch(Animal::getColor())
            {
                case Green:
                    cout << "Green" << endl;
                    break;

                case Blue:
                    cout << "Blue" << endl;
                    break;

                case White:
                    cout << "White" << endl;
                    break;

                case Black:
                    cout << "Black" << endl;
                    break;

                case Brown:
                    cout <<"Brown" << endl;
                    break;
            }
        }

        ~Mammal()
        {
            cout << "destructing Mammal object " << Animal::getName() << endl;
        }

        //prevents object from modification when using this function
        virtual void eat()
        {
            cout << "Mammal eat " << endl;
        }

        virtual void move()
        {
            cout << "Mammal moves" << endl;
        }
};