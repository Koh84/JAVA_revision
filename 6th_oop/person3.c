#include <stdio.h>

struct person{
	char *name;
	char *address;

	void (*printName)(struct person *p);
};

void printName(struct person *p)
{
	printf("name = %s\n", p->name);
	printf("address = %s\n", p->address);
}

int main(int argc, char** argv)
{
	struct person p1 = {"zhangsan","guangdong", printName};
	struct person p2 = {"lisi", "guangdong", printName};

	p1.printName(&p1);
	p2.printName(&p2);

	return 0;
}

