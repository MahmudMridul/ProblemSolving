
using System.Security.Cryptography.X509Certificates;

namespace CSh
{
    public class Program
    {
        public static void Main(string[] args)
        {
            
            int[] test = { 1, 3, 2, 2, 1};
            string testStr = "a what  word  long        ";
            Solution solution = new Solution();
            int result = solution.LengthOfLastWord(testStr);
            Console.WriteLine(result);

            
        }

       
    }

    public class Solution
    {
        public int LengthOfLastWord(string s)
        {
            string[] words = s.Trim().Split(' ');
            return words[words.Length - 1].Length;
        }
    }
}