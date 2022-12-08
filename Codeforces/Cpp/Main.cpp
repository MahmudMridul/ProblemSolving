//#pragma GCC optimize("Ofast")

#include <bits/stdc++.h>

#define endline "\n"

#define ulli unsigned long long int //64
#define lli long long int //64
#define uli unsigned long int //32
#define li long int //32
#define pi 3.1415926535897932384626433832795

using namespace std;

template<typename type>
void readArray(type arr[], int size)
{
    for(int i=0; i<size; ++i) { cin >> arr[i]; }
}

template<typename type>
void readVector(vector<type>& vec, int size)
{
    for(int i=0; i<size; ++i) { type x; cin >> x; vec.push_back(x); }
}

template<typename type>
void readSet(set<type>& list, int size)
{
    for(int i=0; i<size; ++i) { type x; cin >> x; list.insert(x); }
}

template<typename type>
void printArray(type arr[], int n)
{
    for(int i=0; i<n; ++i) 
    {
        if(i == n-1) { cout << arr[i] << endline; }
        else { cout << arr[i] ; } 
    } 
}

template<typename type>
void printVector(vector<type>& vec, int n)
{
    for(int i=0; i<n; ++i) 
    { 
        if(i == n-1) { cout << vec[i] << endline; }
        else { cout << vec[i] << " "; } 
    }
}


template<typename type>
void printVectorPair(vector< pair<type, type> >& vec, int size)
{
    for(int i=0; i<size; ++i) { cout << vec[i].first << " " << vec[i].second << endline; }
}

void tokenize(string str, char delim)
{
    stringstream ss(str);
    string word;

    while(!ss.eof())
    {
        getline(ss, word, delim);
        cout << word << endline;
    }
}


void solve(vector<string>& list, int size)
{
    lli count = 0;

    for(int i = 0; i < size - 1; ++i)
    {
        for(int j = i + 1; j < size; ++j)
        {
            if(list[i][0] == list[j][0] && list[i][1] != list[j][1]) { ++count; }
            else if(list[i][0] != list[j][0] && list[i][1] == list[j][1]) { ++count; }
        }
    }

    cout << count << endline;
}


int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    #ifndef ONLINE_JUDGE
    clock_t start = clock();
    freopen("TextFiles/input.txt", "r", stdin);
    freopen("TextFiles/output.txt", "w", stdout);
    #endif

    int test, n;
    cin >> test;

    while(test--)
    {
        cin >> n;
        vector<string> list;
        readVector(list, n);
        solve(list, n);
    }

    #ifndef ONLINE_JUDGE
    clock_t stop = clock();
    double duration = double(stop-start) / double(CLOCKS_PER_SEC); 
    printf("RUNTIME: %.10f\n",duration);
    #endif


    return 0;
}