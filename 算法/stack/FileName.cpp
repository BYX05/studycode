#include <iostream>
using namespace std;

// ջ���������
#define MAX_SIZE 100

class Stack {
private:
    int top;               // ջ��ָ��
    int arr[MAX_SIZE];     // �洢ջԪ�ص�����

public:
    // ���캯������ʼ��ջ
    Stack() {
        top = -1;  // ջΪ��ʱ��ջ��ָ��Ϊ-1
    }

    // ��ջ����
    bool push(int value) {
        // ���ջ�Ƿ�����
        if (isFull()) {
            cout << "ջ�������޷���ջ" << endl;
            return false;
        }
        // ջ��ָ���1��Ȼ�����Ԫ��
        arr[++top] = value;
        return true;
    }

    // ��ջ����
    bool pop() {
        // ���ջ�Ƿ�Ϊ��
        if (isEmpty()) {
            cout << "ջΪ�գ��޷���ջ" << endl;
            return false;
        }
        // ջ��ָ���1
        top--;
        return true;
    }

    // ��ȡջ��Ԫ��
    int peek() {
        if (isEmpty()) {
            cout << "ջΪ�գ�û��Ԫ��" << endl;
            return -1;  // ����-1��ʾջ��
        }
        return arr[top];
    }

    // �ж�ջ�Ƿ�Ϊ��
    bool isEmpty() {
        return (top == -1);
    }

    // �ж�ջ�Ƿ�����
    bool isFull() {
        return (top == MAX_SIZE - 1);
    }

    // ��ӡջ������Ԫ��
    void printStack() {
        if (isEmpty()) {
            cout << "ջΪ��" << endl;
            return;
        }
        cout << "ջԪ�أ���ջ����ջ�ף���";
        for (int i = top; i >= 0; i--) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

// ������������ջ�Ĺ���
int main() {
    Stack stack;

    // ������ջ����
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.printStack();  // Ӧ���: 30 20 10

    // ���Ի�ȡջ��Ԫ��
    cout << "ջ��Ԫ��: " << stack.peek() << endl;  // Ӧ���: 30

    // ���Գ�ջ����
    stack.pop();
    stack.printStack();  // Ӧ���: 20 10

    // ����ջ�պ�ջ��
    cout << "ջ�Ƿ�Ϊ��: " << (stack.isEmpty() ? "��" : "��") << endl;  // Ӧ���: ��

    // ���ջֱ����
    for (int i = 40; i <= 1000; i += 10) {
        stack.push(i);
    }
    cout << "ջ�Ƿ�����: " << (stack.isFull() ? "��" : "��") << endl;  // Ӧ���: ��

    return 0;
}
