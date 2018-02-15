#include <iostream>

int main(int argc, const char* argv[]) {
  while(true)
    std::cout << (argc == 2 ? argv[1] : "y") << std::endl;
}

