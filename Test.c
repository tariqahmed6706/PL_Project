#include <stdio.h>
#include <string.h>

int main() {
    char users[10][50];   // نخزن لحد 10 أسماء
    int count = 0;

    while (1) {
        char name[50];
        printf("Enter username to add (or 'exit' to stop): ");
        scanf("%s", name);

        if (strcmp(name, "exit") == 0)
            break;

        strcpy(users[count], name);
        count++;

        printf("User added: %s\n\n", name);
    }

    printf("\nAll users:\n");
    for (int i = 0; i < count; i++) {
        printf("- %s\n", users[i]);
    }

    return 0;
}
