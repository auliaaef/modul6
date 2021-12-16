public class Group2{
	public List getUsersSortedByMostRecentlyRegistered(){
		List users = new ArrayList();
		if(!userDirectoryExists ())
			return users;
		addFoundUsersTo(users);
		SortByMostRecentlyRegistered(users);
		return users;
	}
}
