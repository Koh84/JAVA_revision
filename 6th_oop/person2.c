#include <stdio.h>

struct person{
	char *name;
	char *address;

};


int main(int argc, char** argv)
{
	struct person p1 = {"zhangsan","guangdong"};
	struct person p2 = {"lisi", "guangdong"};

	printf("%s\n", p1.name);
	printf("%s\n", p2.name);

	return 0;
}

