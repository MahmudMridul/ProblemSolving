//#pragma GCC optimize("Ofast")

#include <bits/stdc++.h>

#define t_st clock_t start = clock();
#define t_en clock_t stop = clock();
#define t_p double duration = double(stop-start) / double(CLOCKS_PER_SEC); printf("RUNTIME: %.10f\n",duration);

#define endline "\n"

#define ulli unsigned long long int //64
#define lli long long int //64
#define uli unsigned long int //32
#define li long int //32
#define pi 3.1415926535897932384626433832795

using namespace std;


bool compare(pair<int, char> a, pair<int, char> b)
{
    if(a.first <=
    
     b.first)
    {
        return a.second == 'l';
    }
    else return a.second == 'l';
    return false;
}

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
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    freopen("TextFiles/input.txt", "r", stdin);
    freopen("TextFiles/output.txt", "w", stdout);

    vector<int> list;

    for(int i = 0; i < 17; ++i) { int x; cin >> x; list.push_back(x); }

    int val = smallest_greater_equal(list, list.size(), 8);
    cout << val << endline;
    
    val = smallest_greater(list, list.size(), 8);
    //val = upper_bound(list.begin(), list.end(), 8) - list.begin();
    cout << val << endline;

    val = largest_less(list, list.size(), 8);
    cout << val << endline;

    val = largest_less_equal(list, list.size(), 8);
    cout << val << endline;
    


    return 0;
}
