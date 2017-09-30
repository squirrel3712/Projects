USE online_shope;
ALTER TABLE catalog_good ADD FOREIGN KEY(id_catalog) references catalog(id);
ALTER TABLE catalog_good ADD FOREIGN KEY(id_good) references goods(id);