#include <bits/stdc++.h>

using namespace std;

#define endline "\n"

int smallest_greater_equal(vector<int>& list, int size, int num)
{
    int low = 0, high = size - 1;

    while(low <= high)
    {
        int mid = (low + high) / 2;

        if(list[mid] >= num)
        {
            high = mid - 1;
        }
        else 
        {
            low = mid + 1;
        }
    }

    return low;
}

int smallest_greater(vector<int>& list, int size, int num)
{
    int low = 0, high = size - 1;

    while(low <= high)
    {
        int mid = (low + high) / 2;

        if(list[mid] > num)
        {
            high = mid - 1;
        }
        else 
        {
            low = mid + 1;
        }
    }

    return low;
}

int largest_less(vector<int>& list, int size, int num)
{
    int low = 0, high = size - 1;

    while(low <= high)
    {
        int mid = (low + high) / 2;

        if(list[mid] < num)
        {
            low = mid + 1;
        }
        else 
        {
            high = mid - 1;
        }
    }

    return high;
}

int largest_less_equal(vector<int>& list, int size, int num)
{
    int low = 0, high = size - 1;

    while(low <= high)
    {
        int mid = (low + high) / 2;

        if(list[mid] <= num)
        {
            low = mid + 1;
        }
        else 
        {
            high = mid - 1;
        }
    }

    return high;
}

int main()
{
    return 0;
}