package TugasMinggu10.Adapter;

public class ScreencastCatalogAdaptor implements CatalogAdapter{

    private Screencast screencast;

    public ScreencastCatalogAdaptor(Screencast screencast) {
        this.screencast = screencast;
    }

    @Override
    public String getCatalog() {
        return "(Screencast)" + screencast.getTitle() + " by " + screencast.getAuthor()
                + ", Duration : " + screencast.getDuration() + " Minutes";
    }
}
