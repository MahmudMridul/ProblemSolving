#include <bits/stdc++.h>

#define endline "\n"

using namespace std;

deque<char> add(string a, string b)
{
    bool hasCarry = false;
    int dAi = a.length() - 1, dBi = b.length() - 1;
    int loop = max(a.length(), b.length());

    deque<char> sum;

    while(loop--)
    {
        int sumD = 0;
        if(dAi >=0 && dBi >= 0)
        {
            int dA = a[dAi] - '0';
            int dB = b[dBi] - '0';
            sumD = hasCarry ? dA + dB + 1 : dA + dB;
        }
        else if(dAi >= 0)
        {
            int dA = a[dAi] - '0';
            sumD = hasCarry ? dA + 1 : dA;
        }
        else if(dBi >= 0)
        {
            int dB = a[dBi] - '0';
            sumD = hasCarry ? dB + 1 : dB;
        }
        else break;

        hasCarry = sumD >= 10 ? true : false;
        sumD %= 10;
        sum.push_front(sumD + '0');

        --dAi;
        --dBi;
    }

    return sum;
}


int main()
{
    string a = to_string(INT64_MAX);
    string b = to_string(INT64_MAX);
    deque<char> sum = add(a, b);
    
    for(int i = 0; i < sum.size(); ++i)
    {
        cout << sum[i];
    }
    cout << endline;

    return 0;
}