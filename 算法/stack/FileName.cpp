#include <iostream>
using namespace std;

// 栈的最大容量
#define MAX_SIZE 100

class Stack {
private:
    int top;               // 栈顶指针
    int arr[MAX_SIZE];     // 存储栈元素的数组

public:
    // 构造函数，初始化栈
    Stack() {
        top = -1;  // 栈为空时，栈顶指针为-1
    }

    // 入栈操作
    bool push(int value) {
        // 检查栈是否已满
        if (isFull()) {
            cout << "栈已满，无法入栈" << endl;
            return false;
        }
        // 栈顶指针加1，然后存入元素
        arr[++top] = value;
        return true;
    }

    // 出栈操作
    bool pop() {
        // 检查栈是否为空
        if (isEmpty()) {
            cout << "栈为空，无法出栈" << endl;
            return false;
        }
        // 栈顶指针减1
        top--;
        return true;
    }

    // 获取栈顶元素
    int peek() {
        if (isEmpty()) {
            cout << "栈为空，没有元素" << endl;
            return -1;  // 返回-1表示栈空
        }
        return arr[top];
    }

    // 判断栈是否为空
    bool isEmpty() {
        return (top == -1);
    }

    // 判断栈是否已满
    bool isFull() {
        return (top == MAX_SIZE - 1);
    }

    // 打印栈中所有元素
    void printStack() {
        if (isEmpty()) {
            cout << "栈为空" << endl;
            return;
        }
        cout << "栈元素（从栈顶到栈底）：";
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

// 主函数，测试栈的功能
int main() {
    Stack stack;

    // 测试入栈操作
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.printStack();  // 应输出: 30 20 10

    // 测试获取栈顶元素
    cout << "栈顶元素: " << stack.peek() << endl;  // 应输出: 30

    // 测试出栈操作
    stack.pop();
    stack.printStack();  // 应输出: 20 10

    // 测试栈空和栈满
    cout << "栈是否为空: " << (stack.isEmpty() ? "是" : "否") << endl;  // 应输出: 否

    // 填充栈直到满
    for (int i = 40; i <= 1000; i += 10) {
        stack.push(i);
    }
    cout << "栈是否已满: " << (stack.isFull() ? "是" : "否") << endl;  // 应输出: 是

    return 0;
}
