 create the Singleton class using a inner static helper class.
 private inner static class  contains the instance of the singleton class. When the singleton class is loaded, SingletonHelper class will not loaded into memory and only when it  calls the getInstance method, SingletonHelper class gets loaded and creates the Singleton class instance. 